//Player 01
var randomNum1 = Math.floor(Math.random() * 6) + 1;
var randomImg1 = "images/dice" + randomNum1 + ".png";
var image1 = document.querySelectorAll("img")[0];
image1.setAttribute("src", randomImg1);

//Player 02
var randomNum2 = Math.floor(Math.random() * 6) + 1;
var randomImg2 = "images/dice" + randomNum2 + ".png";
var image2 = document.querySelectorAll("img")[1];
image2.setAttribute("src", randomImg2);

//Player 03
var randomNum3 = Math.floor(Math.random() * 6) + 1;
var randomImg3 = "images/dice" + randomNum3 + ".png";
var image3 = document.querySelectorAll("img")[2];
image3.setAttribute("src", randomImg3);

//Player 04
var randomNum4 = Math.floor(Math.random() * 6) + 1;
var randomImg4 = "images/dice" + randomNum4 + ".png";
var image4 = document.querySelectorAll("img")[3];
image4.setAttribute("src", randomImg1);

//Main Logic - winner logic
if(randomNum1 > randomNum2 && randomNum1 > randomNum3 && randomNum1 > randomNum4)
{
	document.querySelector("h1").innerHTML = "Player 01 Wins!";
}
else if(randomNum2 > randomNum1 && randomNum2 > randomNum3 && randomNum2 > randomNum4)
{
	document.querySelector("h1").innerHTML = "Player 02 Wins!";
}
else if(randomNum3 > randomNum1 && randomNum3 > randomNum2 && randomNum3 > randomNum4)
{
	document.querySelector("h1").innerHTML = "Player 03 Wins!";
}
else if(randomNum4 > randomNum1 && randomNum4 > randomNum2 && randomNum4 > randomNum3)
{
	document.querySelector("h1").innerHTML = "Player 04 Wins!";
}
else
{
	document.querySelector("h1").innerHTML = "DRAW";
}