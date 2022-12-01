import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';


export default function V7(){

const URL = "http://127.0.0.1:8080/getv7data"
    
    const [data, setData] = useState();
    useEffect(() => {
        const address = URL;
        console.log(address);

        axios.get(address)
            .then((response) => {
                console.log(response.data);
                setData(response.data);
            }).catch(error => {
                alert(error)
            })

    }, [])

    const sortedData = data && data.sort((a,b) => a.date-b.date)
    const dataCo2 = sortedData &&  (sortedData.filter((d) => d.co2  !== null));
    const dataTemp = sortedData &&  (sortedData.filter((d) => d.temp  !== null));
    
    const chartData = {
        labels: sortedData && sortedData.map(d => d.date),
        datasets: [
            {
                label: "co2",
                data: dataCo2 && dataCo2.map(d => d.co2),
                backgroundColor: 'blue', 
                borderColor: 'blue',
                borderWidth: 1,
                pointRadius: 0,
                yAxisID: 'y',
            },
            {
                label: "temp",
                data: dataTemp && dataTemp.map(d => d.temp),
                backgroundColor: 'red', 
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0,
                yAxisID: 'y1',
            },
        ]
    };

    const options = {
      responsive: true,
      plugins: {
          title: {
              display: true,
              text: 'Evolution of global temperature over the past two million years'
          }
      },
          scales: {
          x: {

              min: -2000000,
              max: 2002
              
          },
          y: {
              position: "left",
              grace: '5%',
              ticks: {
                  stepSize: 10
              },
          },
          y1: {
            position: "right",
              grace: '5%',
              ticks: {
                  stepSize: 10
              },
          }
      },
  }


    return (
        <div> 
            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Line data={chartData} options={options} width="500px" height="auto" />
            </div>
            <div>
                
            </div>
        </div>
    )
}