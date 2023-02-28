import '../style/Ritual.css';

function Ritual() {




    return (
        <>

            <div className='ritual-container'>
                <div className='rit-box1'>
                    <div className='div-title'>
                        <h2 className='rit-title'>Matcha</h2>

                        <button className='button-info'>INFO</button>

                    </div>
                </div>

                <div className='rit-box2'>
                    <div className='div-title'>
                        <h2 className='rit-title'>Chakai</h2>
                        <button className='button-info'>INFO</button>
                    </div>
                </div>

                <div className='rit-box3'>
                    <div className='div-title'>
                        <h2 className='rit-title'>Chaji</h2>
                        <button className='button-info'>INFO</button>
                    </div>
                </div>
            </div>
        </>
    );
}

export default Ritual;