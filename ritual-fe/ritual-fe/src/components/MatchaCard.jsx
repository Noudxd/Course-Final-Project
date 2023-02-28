import '../style/MatchaCard.css';

function MatchaCard() {

    return (
        <div className="card mx-auto my-3" style={{ width: "18rem",height: "22rem", textAlign: "center" }}>
            <div className="card-body">
                <h5 className="card-title">Matcha</h5>
                <p className="card-text">Enjoy the highest quality matcha made with young tea leaves
                    grown in shade, steamed and dried and ground into a fine powder using stone mills.
                    It has an aroma of freshly-mowed grass, and is served as a very concentrated,
                    thick green tea with no added sweeteners.
                </p>
                <p className="card-text">€ 8.00</p>
                <a href="#" className="btn matcha-btn">ADD</a>
            </div>
        </div>

    );

}
export default MatchaCard;