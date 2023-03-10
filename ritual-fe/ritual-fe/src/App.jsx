import 'bootstrap/dist/css/bootstrap.min.css';
import { Routes, Route } from 'react-router-dom';
import { BrowserRouter } from 'react-router-dom';
import FirstPage from './pages/FirstPage';
import UserPage from './pages/UserPage';
import Home from './pages/Home';
import Navbar from './components/Navbar';
import Ritual from './pages/Ritual';
import HappyHour from './pages/HappyHour';
import Cart from './components/Cart';
import React from 'react';
import { useState } from 'react';

export const CartContext = React.createContext(); //per passarsi info di qualsiasi tipo in tutta l'applicazione
export const UserContext = React.createContext();

function App() {
  const [cartItems, setCartItems] = useState([]);
  const [userData, setUserData] = useState({});
  return (
    <>
    {/* racchiude tutte le pagine e gli si passa lo stato di carrello e user */}
      <UserContext.Provider value={{user:[userData, setUserData]}}>
      <CartContext.Provider value={{cart:[cartItems, setCartItems]}}>


        <BrowserRouter>

          <Routes>
            <Route path="/" element={<FirstPage />}></Route>
            <Route path="/welcome" element={<UserPage />}></Route>
            <Route element={<Navbar />} >
              <Route path="/home" element={<Home />}></Route>
              <Route path="/ritual" element={<Ritual />}></Route>
              <Route path="/happy-hour" element={<HappyHour />}></Route>
              <Route path="/cart" element={<Cart />}></Route>
            </Route>
          </Routes>
        </BrowserRouter>
      </CartContext.Provider>
      </UserContext.Provider>
    </>
  );
}

export default App
