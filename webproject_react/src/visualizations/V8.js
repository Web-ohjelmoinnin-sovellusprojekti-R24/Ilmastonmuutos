import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Doughnut } from 'react-chartjs-2';
import 'chartjs-adapter-date-fns';
import { Chart as ChartJS } from "chart.js/auto";
import { Chart } from 'chart.js';



export default function V() {

    //set time data
    const URL = "http://127.0.0.1:8080/getv8data"

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

    //chart data
    const chartData = {
          labels: [
    'Energy',
    'Industrial processes',
    'Agriculture',
    'Waste'
  ],
  datasets: [{
    label: 'Share of global greenhouse gas emissions',
    data: data && data.map(d => d.sector_percent),
    backgroundColor: [
      'rgb(255, 99, 132)',
      'rgb(54, 162, 235)',
      'rgb(2, 255, 83)',
     'rgb(255, 205, 81)',
      'rgb(255, 205, 86)'
    ],
    hoverOffset: 4
  }
]
    };
//tooltip
const test =(tooltipItem) => {
    console.log(tooltipItem);
    return "test";
}

    const config = {
    plugins: {
        tooltip:{
            callbacks: {
                title: test
            }

        }
    }
}
    const options = {
  canvas : {
    height: 450,
    width: 600,

    tooltips: {
        callbacks: {
          title: (items, data) => data.datasets[items[0].datasetIndex].data[items[0].index].myProperty1,
          label: (item, data) => data.datasets[item.datasetIndex].data[item.index].myProperty2
        }
      }

  },
  
    responsive: true,
    maintainAspectRatio: false,
    plugins: {
      legend: {
        position: "top",
      },
      title: {
        display: true,
        text: "Share of global greenhouse gas emissions",
      },
    },

   
      
    
  };

  return (
    <div>

        <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Doughnut options={options} data={chartData} width="900px" height="900px" />
        </div>
        <div>
            <a href="https://gml.noaa.gov/ccgg/about/co2_measurements.html">Data measurement description </a>
        </div>
        <div>
            <p>This graph describes Fossil CO2 emissions by country (territorial)
.</p>
        </div>
    </div>
)
}