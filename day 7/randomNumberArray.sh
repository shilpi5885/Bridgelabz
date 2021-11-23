#Extend the above program to sort the array and then find the 2nd largest and the 2nd smallest element.

for ((i=0; i <10; i++))
do	
	array[$i]=$((RANDOM%1000+100))
	echo ${array[i]}
done

for ((i = 0; i<10; i++))
do
    
    for((j = 0; j<10-i-1; j++))
    do
    
        if [ ${array[j]} -gt ${array[$((j+1))]} ]
        then
            temp=${array[j]}
            array[$j]=${array[$((j+1))]}  
            array[$((j+1))]=$temp
        fi
    done
done
echo ${array[@]}

echo "Second Largest = ${array[8]}"
echo "Second Smallest = ${array[1]}"
