import { useContext } from 'react';
import '../style/Cart.css';
import { CartContext, UserContext } from '../App';


function Cart() {
    
    const { cart } = useContext(CartContext);
    const [cartItems, setCartItems] = cart;
    const { user } = useContext(UserContext);
    const [userData, setUserData] = user;



    function removeFromCart(item) {
        setCartItems(cartItems.filter(cartItem => cartItem !== item));
    }

    const totalPrice = cartItems.reduce((acc, item) => acc + item.prezzo, 0);

    
    const sendOrder = () => {
        //let order = {numPersone: }
        //sendData(order);
    }
    // async function sendData(order) {
    //     fetch('http://localhost:8080/api/ordine/create', {
    //         method: 'POST',
    //         headers: {
    //             'Content-Type': 'application/json',
    //             'Access-Control-Allow-Origin': '*'
    //         },
    //         body: JSON.stringify(order),
    //     }
    //     ).then(res =>{return res.json()})

    return (
            <div className='container'>
                <div className='item1'>
                <h2>Cart</h2>
                <h3>{user.nomeUtente}</h3>
                <h3>{user.email}</h3>
                <h3>{user.telefono}</h3>
                <label htmlFor="nGuests">Number of Guests:</label>
                <input style={{width: "15%"}} type="text" name='nGuests' />
                <br />
                <label htmlFor="nTable">Table number:</label>
                <input style={{width: "15%"}} type="text" name='nTable' />
                <br />
                <br />
                </div>
                {cartItems.length === 0 && <p>Your cart is empty.</p>}
                {cartItems.map(item => (
                    <div key={item.id} className='item2'>
                        <h3 className='cart_product'>{item.nomeProdotto}</h3>
                        <p>Price: €{item.prezzo.toFixed(2)}</p>
                        <button onClick={() => removeFromCart(item)}>Remove</button>
                    </div>
                ))}
                <div className='item3'>
                {cartItems.length > 0 && (
                    <div>
                        <h3 className='cart_total'>Total Price: €{totalPrice.toFixed(2)}</h3>
                    </div>

                )}
                <div className='cart_send'>
                <button onClick={() => sendOrder()}>SEND ORDER</button>
                </div>
                </div>
            </div>
        );

    }

    export default Cart;