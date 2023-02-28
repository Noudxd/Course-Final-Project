import "../style/FirstPage.css";
import { Link } from "react-router-dom"; 

function FirstPage() {


    return (

        <>

            <div>
                <h1 className="title">Ritualize</h1>
                <Link to={'/welcome'}>
                    <button type="button" className="btn-first">PLEASE COME IN</button>
                </Link>
            </div>

        </>


    );
}

export default FirstPage;