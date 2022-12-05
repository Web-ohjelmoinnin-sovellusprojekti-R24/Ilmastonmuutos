import { Chart } from "chart.js/auto";
import "chartjs-adapter-luxon";
import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Doughnut } from 'react-chartjs-2';


const URL = "http://127.0.0.1:8080/getalldata"


export default function TimeLineGraphDemo() {
  
  
const [data, setData] = useState();
useEffect(() => {
    const address = URL
    console.log(address);
    axios.get(address)
        .then((response) => {
            console.log(response.data);
            setData(response.data);
        }).catch(error => {
            alert(error)
        })

}, [])
  
const chardata = {
    labels: [
    'Energy',
    'Industrial processes',
    'Agriculture',
    'Waste'
    ],
    datasets: [{
      label: 'Share of global greenhouse gas emissions',
      data:data,
      backgroundColor: [
        'rgb(255, 99, 132)',
        'rgb(54, 162, 235)',
        'rgb(255, 205, 86)'
      ],
      hoverOffset: 4
    }]
  };
const config = {
  type: 'doughnut',
  data: data && data.map(d => d.sector_percent),
};
  
const options = {
    responsive: true,
    plugins: {
      legend: {
        position: "top",
      },
      title: {
        display: true,
        text: "Time Line Graph Demonstration",
      },
    },
  };

  return (
    <div style={{ width: "1000px" }}>
      <h1>TimeLineGraphDemo</h1>
      <Doughnut options={options} data={data} />
    </div>
  );
}