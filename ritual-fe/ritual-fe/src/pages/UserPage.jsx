import "../style/UserPage.css";
import UserForm from '../components/UserForm';


function UserPage() {

    return (
        <>
            
            <div className="container_box">
            <div className="box1">
                <h2 className="intro">A healthy and happy life is not a destination, it’s a habit.</h2>
                <p className="text">Ritualize it's a magical place that wants to bring you to the japanise
                    art of living in harmony with life itself through the Japanese tea ceremony, also known as Chadō,
                    and the taste of delicious food together with typical japanese cocktails.
                    Tea ceremonies are an important part of Japanese culture,
                    coming from the Zen Buddhism, and the cerimony itself is carefully choreographed
                    by preparing and sharing a bowl of finely powdered green tea, called matcha,
                    served with traditional Japanese sweets to harmonise the tea’s bitter taste.
                    You will temporarily withdraw from the mundane world to share a moment of beauty and serenity.
                    If you wish, you can enjoy your time after a busy day choosing the Happy Hour option,
                    a way to taste some typical japanese food along with a drink,
                    another way of loving yourself by sharing fun!
                    Enjoy your stay and thank you! </p>
            </div>
            <div className="box2">
            <h2 className="titleForm">Please introduce yourself:</h2>
            <UserForm />
            </div>
            </div>
            








        </>
    );
}

export default UserPage;