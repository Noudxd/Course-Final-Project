import { useState, useContext  } from 'react';
import { useNavigate } from 'react-router-dom';
import { UserContext } from '../App';





function UserForm() {

  const {user} = useContext(UserContext);
    const [userData, setUserData] = user;
  

  const navigate = useNavigate();

  const [inputs, setInputs] = useState({
    nomeUtente: '',
    email: '',
    tel: ''
  });

  const handleChange = (event) => {
    setInputs({
      ...inputs,
      [event.target.name]: event.target.value
    });
  }
  const handleSubmit = (event) => {
    event.preventDefault();


    fetch('http://localhost:8080/api/utente/create', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(inputs)
    })

      .then(data => {
        setUserData(inputs)
        navigate('/home');
        console.log(data);
      })
      .catch(error => {
        console.log(error);
      });
  }

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>
          <input
            type="text"
            name="nomeUtente"
            placeholder="First Name"
            value={inputs.nomeUtente || ""}
            onChange={handleChange}
            required
          />
        </label>
      </div>
      <br />
      <div>
        <label>
          <input
            type="email"
            name="email"
            placeholder="Your email"
            value={inputs.email || ""}
            onChange={handleChange}
            required
          />
        </label>
      </div>
      <br />
      <div>
        <label>
          <input
            type="tel"
            name="telefono"
            placeholder="Your phone number"
            value={inputs.telefono || ""}
            onChange={handleChange}
          />
        </label>
      </div>
      <br />
      <button className='btnForm' type='submit'>Enter</button>

    </form>
  );
}

export default UserForm;