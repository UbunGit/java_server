<template>
    <div class="content">
        <van-button class="button_return" icon="arrow-left" >返回</van-button>
        <van-button class="button_sigup" >注册</van-button>
        <div class="header">
            <p class="welcom">登录</p>
            <p  style="font-size: larger;">欢迎回来 ^_^</p>
     
        </div>
    </div>
</template>
<script>
export default {
    
}
</script>

<style scoped>

.content{
    position:relative; 
    background: linear-gradient( #1e1ef3,#5353f0); 
    
    min-width: 360px;
    max-width: 600px;
    min-height: 360px;
    border-radius: 16px;
    text-align: center;
    margin: auto;
}
.button_return{
    position:absolute;
    top:15px;
    left:15px; 
    background-color: #1e1ef300;
    border-radius: 20px;
    color: white;
    border-style: none;
    animation: ease-in-out;
}
.button_return:hover{
    top:10px;
    box-shadow: 5px 5px 5px -5px rgba(255, 255, 255, 0.3);
}


.button_sigup{
    position:absolute;
    top:10px;
    right:0px; 
    border-radius: 20px 0 0 20px;
	height: 40px;
    width: 60px;
    animation: ease-in-out;
}
.button_sigup:hover{
    width: 80px;
    
}

.header{
    position:absolute;
    top:55px;
    left:50px; 
    text-align: left;
    color: white; 
}

.welcom{

}
.welcom::before,
.welcom::after {
        position: absolute;
        content: "";
        bottom : 100px;
        left: 0;
        width: 8px;
        height: 16px;
        border-radius: 20px 0 20px 0px;
        background: rgb(255, 255, 255);
        transform: translate(0, 90);
        animation: move 7.5s ease-in-out infinite;
    }
    
.welcom::after {
    animation: move 7.5s ease-in-out 1s infinite;
}

@media screen and (min-width: 720px) {
/* .content{
     background-size: cover;
    clip-path: polygon(0% 6%, 6% 0, 23% 0, 26% 4%, 96% 4%, 100% 10%, 100% 91%, 95% 98%, 6% 98%, 0 90%);
    } */
}

@media screen and (max-width: 720px) {
.content{
    position: absolute;
    border-radius: 0;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    }
}

@keyframes move {
    80% {        
        bottom : -30px;
        transform: translate(600px, 0);
    } 93% {
        transform: translate(600px, 3px);
        opacity: 1;
    }100% {
        transform: translate(600px, 150px);
        opacity: 0;
    }
}

</style>