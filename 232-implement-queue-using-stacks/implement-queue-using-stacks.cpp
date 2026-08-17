#include <stack>

class MyQueue {
private:
    std::stack<int> s1, s2;

public:
    // Push element to the back of queue
    void push(int x) {
        s1.push(x);
    }

    // Remove element from front of queue
    int pop() {
        if (s2.empty()) {
            // Transfer all elements from s1 to s2
            while (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        }
        int front = s2.top();
        s2.pop();
        return front;
    }

    // Get the front element
    int peek() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        }
        return s2.top();
    }

    // Check if queue is empty
    bool empty() {
        return s1.empty() && s2.empty();
    }
};