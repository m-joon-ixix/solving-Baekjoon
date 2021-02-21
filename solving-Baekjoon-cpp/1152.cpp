//
// https://www.acmicpc.net/problem/1152
//

#include <iostream>

int main(){
    std::string str;
    getline(std::cin, str);
    // trim off the trailing spaces at start and end of str
    unsigned int idx = 0;
    while(idx < str.size() && str[idx] == ' ') idx++;
    if(idx == str.size()){
        // if the whole string is empty space
        std::cout << 0;
        return 0;
    }
    str = str.substr(idx);

    idx = str.size() - 1;
    while(str[idx] == ' ') idx--;
    str = str.substr(0, idx + 1);

    int count = 1; // number of words
    for(int i = 0; i < str.size(); i++){
        if(str[i] == ' ') count++;
    }

    std::cout << count;
    return 0;
}