echo "Select an option 1. Feet to Inch 2. Inch to Feet 3. Feet to Meter 4. Meter to Feet"
read opt
	
case $opt in 
   1)
      	echo "enter number of feet"
	read feet
	inch=$(( $feet * 12 ))
	echo "Inches: $inch"
      	;;
   2)
      	echo "enter number of inches"
	read inch
	feet=$(( $inch / 12 ))
	echo "Feet: $feet"
      	;;
   3)
      	echo "enter number of feet"
	read feet
	meter=$((feet*100/32))
	echo $meter
      	;;
   4)
      	echo "enter number of meter"
	read meter
	feet=$((meter*32/100))
	echo "Feet: $feet"
      	;;
   *)
     echo "Invalid Input ..."
     ;;
esac
