heads=0
tails=0
declare -A singlet
declare -A doublet
declare -A triplet

read -p "Enter the no of times the coin should flip: " n

for((i=1;i<=n;i++))

do
	singlet[$i]=$((RANDOM%2))
	if [[ singlet[$i] -eq 0 ]]; then
       		heads=$(($heads+1))
	elif [[ singlet[$i] -eq 1 ]]; then
    		tails=$(($tails+1))
	fi
done	

echo "Singlet: ${singlet[@]}"

for (( i=1; i<=n; i++ ))
do
  flip1=$((RANDOM%2))
  flip2=$((RANDOM%2))
  case $flip1$flip2 in
	00)
	   echo "Heads Heads"
	   (( doublet[HH]++ ))
	   ;;
	01)
	   echo "Heads Tails"
	   (( doublet[HT]++ ))
	   ;;
	10)
	   echo "Tails Heads"
	   (( doublet[TH]++ ))
	   ;;
	11)
	   echo "Tails Tails"
	   (( doublet[TT]++ ))
	   ;;
  esac
done
echo "Doublet: ${!doublet[@]}"

for (( i=1; i<=n; i++ ))
do
  flip1=$((RANDOM%2))
  flip2=$((RANDOM%2))
  flip3=$((RANDOM%2))
  case $flip1$flip2$flip3 in
	000)
	   echo "Heads Heads Heads"
	   (( triplet[HHH]++ ))
	   ;;
	001)
	   echo "Heads Heads Tails"
	   (( triplet[HHT]++ ))
	   ;;
	010)
	   echo "Heads Tails Heads"
	   (( triplet[HTH]++ ))
	   ;;
	011)
	   echo "Heads Tails Tails" 
	   (( triplet[HTT]++ ))
	   ;;
	100)
	   echo "Tails Heads Heads"
	   (( triplet[THH]++ ))
	   ;;
	101)
	   echo "Tails Heads Tails"
	   (( triplet[THT]++ ))
	   ;;
	110)
	   echo "Tails Tails Heads" 
	   (( triplet[TTH]++ ))
	   ;;
	111)
	   echo "Tails Tails Tails" 
	   (( triplet[TTT]++ ))
	   ;;
  esac
done

echo "Triplet: ${!triplet[@]}"
