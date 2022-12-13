import React from 'react'

import 'bootstrap/dist/css/bootstrap.min.css';

import { Link } from 'react-router-dom';

export default function CreateViewHome() {
  return (
    <div className='layouttext'>CreateViewHome
            <div>
                <p className='layouttext'><Link to="/createview1">Layout1</Link></p>
            </div>
            <div>
                <p className='layouttext'><Link to="/createview2">Layout2</Link></p>
            </div>
    </div>
  )
}