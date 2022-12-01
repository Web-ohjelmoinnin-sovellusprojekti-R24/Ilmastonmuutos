import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';
import { yearsToMonths } from 'date-fns';




export default function V8() {

    //set time data
    const URL = "http://127.0.0.1:8080/getv7data"
    
    const [data2, setData] = useState();
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
    

    //chart data
    const chartData = {
        datasets: [
            {
                label: "Example",
                data: [
                    {
                        time: "-300133",
                        value: "239.00"
                    },
                    {
                        time: "-301165",
                        value: "236.00"
                    },
                    {
                        time: "-302150",
                        value: "240.20"
                    },
                    {
                        time: "-303149",
                        value: "240.70"
                    },
                    {
                        time: "-303827",
                        value: "250.20"
                    },
                ],
        borderColor: "rgb(255, 99, 132)",
        backgroundColor: "rgba(255, 99, 132, 0.5)",
        parsing: {
          xAxisKey: "time",
          yAxisKey: "value",
            },
            pointRadius: 1,
        },
        {
            label: "Example 2",
            data: [
                {
                    time: "-301000",
                    value: "-3.80"
                },
                {
                    time: "-302000",
                    value: "-3.66"
                },
                {
                    time: "-303000",
                    value: "-3.56"
                },
                {
                    time: "-304000",
                    value: "3.29"
                },
                {
                    time: "-305000",
                    value: "-3.22"
                },
            ],
            borderColor: "rgb(0, 0, 0)",
        backgroundColor: "rgba(0, 0, 0, 0.5)",
        parsing: {
          xAxisKey: "time",
          yAxisKey: "value",
        },
        pointRadius: 1,
        },
        ],
    };
    
    //options
    const options = {
        responsive: true,
        plugins: {
            legend: {
                position: "top",
            },
            title: {
                display: true,
                text: 'Ice core 800k year composite study CO2 measurements'
            },
        },
            scales: {
            x: {
                min: -300130,
                max: -305000,
                
            },
            y: {
                position: "left",
                grace: '5%',
                ticks: {
                    stepSize: 0.5
                },
                y1: {
                    type: 'linear',
                    display: true,
                    position: "right",
                }
            },
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