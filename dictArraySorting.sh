read -p "Enter first number: " a
read -p "Enter second number: " b
read -p "Enter third number: " c

counter=0

declare -A test_var

test_var[key1]=$((a+b*c))

test_var[key2]=$((a*b+c))

test_var[key3]=$((c+a/b))

test_var[key4]=$((a%b+c))


test_arr[((counter++))]=${test_var[key1]}
test_arr[((counter++))]=${test_var[key2]}
test_arr[((counter++))]=${test_var[key3]}
test_arr[((counter++))]=${test_var[key4]}


echo "Array before sorting: ${test_arr[@]}"

for ((i = 0; i<4; i++))
do
    
    for((j = 0; j<4-i-1; j++))
    do
    
        if [ ${test_arr[j]} -gt ${test_arr[$((j+1))]} ]
        then
            temp=${test_arr[j]}
            test_arr[$j]=${test_arr[$((j+1))]}  
            test_arr[$((j+1))]=$temp
        fi
    done
done

echo "Array in ascending order: ${test_arr[@]}"

echo "Array in descending order:" 

for((i=3;i>=0;i--))
do
	echo "${test_arr[$i]}"
done
