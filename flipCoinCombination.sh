heads=0
tails=0
declare -A singlet
declare -A doublet

for((i=1;i<=10;i++))

do
	singlet[$i]=$((RANDOM%2))
	if [[ singlet[$i] -eq 0 ]]; then
       		heads=$(($heads+1))
	elif [[ singlet[$i] -eq 1 ]]; then
    		tails=$(($tails+1))
	fi
done	

hp=$((heads*10))
tp=$((tails*10))

echo ${singlet[@]}
echo "Percentage of Heads: $hp"
echo "Percentage of Tails: $tp"



