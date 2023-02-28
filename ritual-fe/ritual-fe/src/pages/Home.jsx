import '../style/Home.css';
import { Link } from "react-router-dom";



function Home() {

    return (
        <>
        <div className='home-container'>
            <div className='home-box1'>
        <Link to={'/ritual'} className='btnBox'>Enter</Link>

            </div>

            <div className='home-box2'>
            <Link to={'/happy-hour'} className='btnBox'>Enter</Link>

            </div>


            



        </div>
        </>



    );

}

export default Home;