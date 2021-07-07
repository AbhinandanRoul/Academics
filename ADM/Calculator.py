import streamlit as st
# Finding order in multiplicative group
st.subheader('Find Element order in a group')
def find_MultiplicativeGroup(num, group):
    count=1

    while(num**count%group!=1):
        if(num**count%group==0): # for infinity order
            return "infinity"
        count+=1
    return count

# Finding order in additive group
def find_AdditiveGroup(num, group):
    count=1
    x=num
    while(x%group!=0):
        x+=num
        count+=1
    return count

# Finding cycle decompositions
def CycleDecomp(maplist):
    n = len(maplist)
    if (max(maplist) != n): #Check for extra elements
        st.warning('Check input')
        return 0
    fixedlist = []
    for i in range(1, n + 1):
        fixedlist.append(i)

    x = dict()  # Dictionary to store symmetric mappings as key, value pair
    for i in range(0, n):
        x[i + 1] = maplist[i]  # Create a mapped list
    return x


def FindDecomp(l):
    used_key_list = []
    output_list=[]
    for key in l:
        if (key not in used_key_list):
            temp_key = key;
            v = l[temp_key]
            output_list.append('(')
            while (v != key):
                output_list.append(temp_key)
                used_key_list.append(temp_key)
                temp_key = v;
                v = l[temp_key]
                if (v == key):
                    used_key_list.append(temp_key)
                    output_list.append(temp_key)
                    output_list.append(')')
                    break;
    return output_list


group=st.number_input('Enter the group i.e., in Z/nZ write n',value=1)
num=st.number_input('Enter the integer to find its order', value=1)
text=st.selectbox('Enter M for Multiplicative, A for additive', ('Additive group order','Multiplicative group order'))
if text=='Multiplicative group order':
    st.write("FOR MULTIPLICATIVE order=:",find_MultiplicativeGroup(num,group))
elif text=='Additive group order':
    st.write("For ADDITIVE order=:",find_AdditiveGroup(num, group))


st.subheader('Cycle Decomposition')
user_arr = st.text_input('Enter numbers separated by space').strip()
user_input = [int(item) for item in user_arr.split(" ")]

l = CycleDecomp(user_input)  # Mapped List
output=FindDecomp(l)
st.text(output)
