import '../style/HappyHourCard.css';
import { useState, useEffect } from 'react';
import { useContext } from 'react';
import { CartContext} from '../App';


function HappyHour() {
    const {cart} = useContext(CartContext);
    const [cartItems, setCartItems] = cart;

    const [foodItems, setFoodItems] =  useState([]);

    const [drinkItems, setDrinkItems] =  useState([]);

    



    function addToCart(item) {
        setCartItems([...cartItems, item]);
    }

    useEffect(() => {
        (async() => {
            const items = await fetch('http://localhost:8080/api/prodotto/all');
            const itemsData = await items.json();
            const foodArr = itemsData.filter(food => food.categoria === 'food')
            setFoodItems(foodArr)
            const drinkArr = itemsData.filter(drink => drink.categoria === 'drink')
            setDrinkItems(drinkArr);
        }) () //con questa lanci la funzione async
        
    }, [] //parametro che indica quando viene richiamata la funzione, essendo vuoto succede solo una volta al reindirizzamento della pagina
    
    )

    return (
        <>
        
            <div className="food-container">
                <h1 className="food">Food</h1>
            </div>
            <div className="wrapper d-flex align-items-center flex-row flex-wrap justify-content-center">
                {foodItems.map(product => (
                    <div className='' key={product.id}>
                        <div className="card mx-3 my-5" style={{ width: "18rem", textAlign: "center" }} >
                            <img src={product.pathImg} className="card-img-top" alt="..." height="200" />
                            <div className="card-body">
                                <h5 className="card-title">{product.nomeProdotto}</h5>
                                <p className="card-text">€ {product.prezzo}</p>
                                <div className='add'>
                                    <input type="number" defaultValue={1} className='quantity' />
                                    <button className='buttonAdd' onClick={() => addToCart(product)}>Add to Cart</button>
                                </div>

                            </div>
                        </div>
                    </div>
                ))}
                <div className="drink-container">
                    <h1 className="food">Drink</h1>
                </div>
                {drinkItems.map(product => (
                    <div className='card-container' key={product.id}>
                        <div className="card mx-3 my-5" style={{ width: "20em", textAlign: "center", }}>
                            <img src={product.pathImg} className="card-img-top" alt="..." height="300" />
                            <div className="card-body">
                                <h5 className="card-title">{product.nomeProdotto}</h5>
                                <p className="card-text">€ {product.prezzo}</p>
                                <div className='add'>
                                    <input type="number" defaultValue={1} className='quantity' />
                                    <button className='buttonAdd' onClick={() => addToCart(product)}>Add to Cart</button>
                                </div>

                            </div>
                        </div>
                    </div>
                ))}
            
            </div>

        </>
    );



}

export default HappyHour;