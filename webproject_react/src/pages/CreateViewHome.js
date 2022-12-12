import React from 'react'

import 'bootstrap/dist/css/bootstrap.min.css';

import { Link } from 'react-router-dom';

export default function CreateViewHome() {
  return (
    <div>CreateViewHome
            <div>
                <p><Link to="/createview1">Layout1</Link></p>
            </div>
            <div>
                <p><Link to="/createview2">Layout2</Link></p>
            </div>
    </div>
  )
}