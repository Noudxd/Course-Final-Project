import bgImage from "../assets/Images/bg_image.jpg";
import "../style/FirstPage.css";


function FirstPage() {
    const styles = {

        backgroundImage: `url(${bgImage})`,
        backgroundPosition: 'center',
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat',
        width: '100vw',
        height: '100vh',

    };

    return (

        <>
            <div className="bgImg" style={styles}>
                <h1 className="title">Ritualize</h1>
            <button className="btn">ENTER</button>
            </div>
            
        </>


    );
}

export default FirstPage;