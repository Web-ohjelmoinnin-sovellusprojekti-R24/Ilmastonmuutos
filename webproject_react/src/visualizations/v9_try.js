import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Doughnut } from 'react-chartjs-2';
import 'chartjs-adapter-date-fns';
import { Chart as ChartJS } from "chart.js/auto";
import { Chart } from 'chart.js';



export default function V() {

    //set time data
    const URL = "http://127.0.0.1:8080/getalldata"

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
    const options = {
        plugins: {
            legend: {
                responsive: true,
                position: 'top',
            },
            title: {
                display: true,
                text: 'Share of global greenhouse gas emissions',

                position: 'top',
            tooltip:{
                enabled: true,
                callback:{
                    afterFooter: function(context){
                     //   return:"hello"
                    }
                }
                }


                }
                }
                
            

                
            
        
    };
    return (
        <div>
            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
                <Doughnut options={options} data={chartData} width="5%" height="5%" top="50%" position="absolute"/>
            </div>
        </div>
    )
}