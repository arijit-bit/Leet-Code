class MyQueue {
public:
    vector<int>s1, s2;
    MyQueue() {
        
    }
    
    void push(int x) {
        while(!s1.empty()){
            s2.push_back(s1.back());
            s1.pop_back();
        }
        s1.push_back(x);
        while(!s2.empty()){
            s1.push_back(s2.back());
            s2.pop_back();
        }
    }
    
    int pop() {
        int ans=s1.back();
        s1.pop_back();
        return ans;
    }
    
    int peek() {
        return s1.back();
    }
    
    bool empty() {
        return s1.empty();
        
    }
};
