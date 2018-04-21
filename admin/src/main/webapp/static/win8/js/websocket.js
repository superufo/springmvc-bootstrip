var Script = function () {
	var socket;
    
    function connectServer() {
     if (!window.WebSocket) {
         window.WebSocket = window.MozWebSocket;
     }
     if (window.WebSocket) {
         socket = new WebSocket("ws://localhost:8800/ws");
         socket.onmessage = function(event) {
             var ta = document.getElementById('responseText');
             ta.value = ta.value + '\n' + event.data
         };
         socket.onopen = function(event) {
             var ta = document.getElementById('responseText');
             ta.value = "连接开启!";
         };
         socket.onclose = function(event) {
             var ta = document.getElementById('responseText');
             ta.value = ta.value + "连接被关闭";
         };
     } else {
         alert("你的浏览器不支持 WebSocket！");
     }
    }
    
    function send(message) {
        if (!window.WebSocket) {
            return;
        }
        if (socket.readyState == WebSocket.OPEN) {
            socket.send(message);
        } else {
            alert("连接没有开启.");
        }
    }
}();