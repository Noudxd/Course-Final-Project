import { useState } from "react";
import "../style/Navbar.css";
import Logo from "./Logo";
import { GiHamburgerMenu } from 'react-icons/gi';
import { MdOutlineRestaurantMenu } from 'react-icons/md';
import { MdShoppingBag } from "react-icons/md";
import { Link, Outlet } from "react-router-dom";



function Navbar() {

    const [toggleMenu, setToggleMenu] = useState(false);

    return (
        <><div className="header">
            <Logo />
           <div>
           <Link to="/cart"  className="shopping-cart-btn">
                <MdShoppingBag fontSize={30} color="#4A4848"  />
            </Link>
            <GiHamburgerMenu color="#4A4848" fontSize={35} className="menu_icon" onClick={() => setToggleMenu(true)} />
            {toggleMenu && (
                <div className="menu-show">
                    <MdOutlineRestaurantMenu color="#FF0000" fontSize={35} className="overlay_close" onClick={() => setToggleMenu(false)} />
                    <ul className='app_navbar-links'>
                        <li>
                            <Link to="/home" className='link'>Home</Link>
                        </li>
                        <ul>
                            <li>
                                <Link to="/ritual" className='link'>Ritual</Link>
                            </li>
                            <li>
                                <Link to="/happy-hour" className='link'>Happy Hour</Link>
                            </li>

                        </ul>

                    </ul>
                </div>
            )}
            </div>
        </div><Outlet></Outlet></>


    );


}

export default Navbar;