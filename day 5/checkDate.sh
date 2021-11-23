read -p " Enter Date:-" Date
read -p " Enter Month:-" Month

if (($Month == 3 && $Date >= 20 && $Date<31))
then
        echo $Month $Date "True";

elif (($Month == 4 && $Date >= 1 && $Date<31))
then
        echo $Month $Date "True";
elif (($Month == 5 && $Date >= 1 && $Date<31))
then
        echo $Month $Date "True";
elif (($Month == 6 && $Date <= 20))
then
        echo $Month $Date "True";
else        
	echo "False";
fi
