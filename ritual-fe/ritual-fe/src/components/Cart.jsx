import { useContext } from 'react';
import '../style/Cart.css';
import { globale } from '../App';

function Cart() {
    const { cart } = useContext(globale);
    const [cartItems, setCartItems] = cart;



    function removeFromCart(item) {
        setCartItems(cartItems.filter(cartItem => cartItem !== item));
    }

    const totalPrice = cartItems.reduce((acc, item) => acc + item.prezzo, 0);

    const sendOrder = () => {
        //let order = //corpo ordine = postman
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
            <div className='cart-content'>
                <h2>Cart</h2>
                <label htmlFor="nGuests">Number of Guests:</label>
                <input type="text" name='nGuests' />
                <br />
                <label htmlFor="nTable">Table number:</label>
                <input type="text" name='nTable' />
                <br />
                <br />
                {cartItems.length === 0 && <p>Your cart is empty.</p>}
                {cartItems.map(item => (
                    <div key={item.id}>
                        <h3>{item.nomeProdotto}</h3>
                        <p>Price: €{item.prezzo.toFixed(2)}</p>
                        <button onClick={() => removeFromCart(item)}>Remove</button>
                    </div>
                ))}
                {cartItems.length > 0 && (
                    <div>
                        <h3>Total Price: €{totalPrice.toFixed(2)}</h3>
                    </div>

                )}
                <button onClick={() => sendOrder()}>SEND ORDER</button>
            </div>
        );

    }

    export default Cart;