import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { Chart } from 'chart.js';



export default function V4(){
    const URL = "http://127.0.0.1:8080/getv4data"


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


    const chartData = {
        labels: data && data.map(d => d.year),
        datasets: [
            {
                label: "DE08",
                data: data && data.map(d => d.de08),
                backgroundColor: 'red',
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0
                
            },
            {
                label: "DE08_2",
                data: data && data.map(d => d.de082),
                backgroundColor: 'green',
                borderColor: 'green',
                borderWidth: 1,
                pointRadius: 0
                
            },
            {
                label: "DSS",
                data: data && data.map(d => d.dss),
                backgroundColor: 'blue',
                borderColor: 'blue',
                borderWidth: 1,
                pointRadius: 0
                
            },
        ]
    };


    const options = {
        plugins: {
            title: {
                display: true,
                text: 'Co2 from Mauna loa'
            }
        },
        scales: {
            x:{
                type: 'time',
                time: {
                    unit: 'year'
                    
                }
                
            },
            y:{
                position: "right",
                grace: '5%',
                ticks:{
                    stepSize: 0.1
                },
            }
        }
    }
    return (
        <div>
            <div style={{display: 'flex', alignItems: 'center',flexWrap: 'wrap' }}>
            <Line options={options} data={chartData} width="500px" height="auto" />
            </div>
            <div>
                <a href="https://cdiac.ess-dive.lbl.gov/ftp/trends/co2/lawdome.combined.dat">Data used in chart</a>
            </div>
            <div>
                <a href="https://cdiac.ess-dive.lbl.gov/trends/co2/lawdome.html">Data description</a>
            </div>
            <div>
                <p>Historical co2 records from the Law Dome DE08, DE08-2, and DSS Ice Cores</p>
            </div>
        </div>
    )


}