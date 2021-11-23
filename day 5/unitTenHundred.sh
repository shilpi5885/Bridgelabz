echo "Enter a number"
read num

       if [ $num = 1  ]
       then
           echo "Unit"
       elif [ $num == 10 ]
       then
           echo "Ten"
       elif [ $num == 100 ]
       then
           echo "Hundred"
       elif [ $num == 1000 ]
       then
           echo "Thousand"
       elif [ $num == 10000 ]
       then
           echo "Ten Thousand"
       elif [ $num == 100000 ]
       then
           echo "One lakh"
       else
           echo "Invalid Input!"
       fi
