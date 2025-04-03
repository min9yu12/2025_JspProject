<!-- ObjTotalGraphSpark.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<style>
    @font-face {
        font-family: 'PFStarDust';
        src: url('fonts/PFStarDust-Bold.ttf') format('truetype');
        font-weight: bold;
        font-style: normal;
    }

    body {
        margin: 0;
        background-color: #1d102d;
        font-family: 'PFStarDust', sans-serif;
        color: white;
    }

    .spark-container {
        position: absolute;
        left: 18vw;
        top: 9.5vh;
        width: 70%;
        height: 74.5vh;
        background-color: rgba(29, 16, 45, 0.7);
        color: white;
        border-radius: 15px;
        box-shadow: 0 0 20px rgba(255,255,255,0.4);
        display: flex;
        flex-direction: column;
        padding: 20px;
        box-sizing: border-box;
    }

    /* 🔹 상단 탭 + 통계 */
    .graph-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 10px;
    }

    .graph-tab {
        display: flex;
        gap: 10px;
        margin-left:20px;
        margin-top:5px;
        margin-bottom:20px;
    }

    .graph-tab-btn {
        background: none;
        border: none;
        color: #fff;
        padding: 5px 12px;
        cursor: pointer;
        transition: 0.2s;
        font-family: 'PFStarDust', sans-serif;
        font-weight: bold;
        font-size: 1vw;
    }

    .graph-tab-btn.active {
        border-bottom: 2px solid white;
    }

    /* 🔹 중간: 그래프 + 버튼 */
    .graph-body {
        flex: 1;
        display: flex;
        gap: 20px;
    }

    .graph-wrapper {
        flex: 1;
        display: flex;
        justify-content: flex-start;
        align-items: flex-start;
    }

    .graph-card {
        width: 100%;
        height: 500px;
        background-color: white;
        border-radius: 10px;
        padding: 30px;
        box-sizing: border-box;
        margin-left:10px;
    }

    .graph-sidebar {
        width: 120px;
        display: flex;
        flex-direction: column;
        align-items: flex-start;
        justify-content: flex-start;
        gap: 15px;
        padding-top: 30px;
    }

    .graph-sidebar button {
        padding: 10px 16px;
        font-size: 0.9vw;
        border-radius: 8px;
        background-color: rgba(255,255,255,0.1);
        border: 1px solid white;
        color: white;
        cursor: pointer;
    }

    /* 🔹 하단 텍스트 */
    .bottom-text {
        margin-top: auto;
        font-size: 0.9vw;
        padding-top: 10px;
    }

</style>

<div class="spark-container">
    <!-- 상단 탭 + 통계 -->
    <div class="graph-header">
        <div class="graph-tab">
            <button class="graph-tab-btn active">주간</button>
            <button class="graph-tab-btn">월간</button>
        </div>
    </div>

    <!-- 중간 본문: 그래프 + 버튼 -->
    <div class="graph-body">
        <div class="graph-wrapper">
            <div class="graph-card">
                <canvas id="myChart"></canvas>
            </div>
        </div>

        <div class="graph-sidebar">
            <button>껐은 선</button>
            <button>막대</button>
        </div>
    </div>

    <!-- 하단 텍스트 -->
    <div class="bottom-text">이번 주 총 작업 시간 : 3000H</div>
</div>

<script>
    const ctx = document.getElementById('myChart').getContext('2d');

    const chart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['2016', '2017', '2018', '2019', '2020', '2021'],
            datasets: [{
                label: '연간 작업량',
                data: [1230000, 1275000, 1330000, 1420000, 1450000, 1530000],
                borderColor: function(ctx) {
                    return ctx.dataIndex === 5 ? 'red' : '#0277bd';
                },
                borderWidth: 2,
                pointRadius: 6,
                pointBackgroundColor: function(ctx) {
                    return ctx.dataIndex === 5 ? 'red' : '#0277bd';
                },
                fill: false,
                tension: 0.3
            }]
        },
        options: {
            plugins: {
                legend: {
                    display: false
                }
            },
            scales: {
                y: {
                    ticks: {
                        callback: function(value) {
                            return value.toLocaleString();
                        }
                    }
                }
            }
        }
    });
</script>
