
echo "Enter first number"
read num1
echo "Enter first number"
read num2
echo "Enter first number"
read num3
echo "Enter your selection: 1. a + b * c 2. a % b + c 3. c + a / b 4. a * b + c1."
read option
	
	if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]
	then
    		echo "Max: $num1"
	elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]
	then
    		echo "Max: $num2"
	else
    		echo "Max: $num3"
	fi

	if [ $num1 -lt $num2 ] && [ $num1 -lt $num3 ]
	then
    		echo "Min: $num1"
	elif [ $num2 -lt $num1 ] && [ $num2 -lt $num3 ]
	then
    		echo "Min: $num2"
	else
    		echo "Min: $num3"
	fi

	if [ $option == 1  ]
       	then
		r=$(($num1 + $num2*$num3))
           	echo "Result is: $r"
       	elif [ $option == 2 ]
       	then
		r=$(($num3 + $num1/$num2))
           	echo "Result is: $r"
       	elif [ $option == 3 ]
       	then
		r=$(($num1 % $num2+$num3))
           	echo "Result is: $r"
       	elif [ $option == 4 ]
       	then
		r=$(($num1 * $num2+$num3))
           	echo "Result is: $r"
       	else
           	echo "Invalid Input!"
       	fi
