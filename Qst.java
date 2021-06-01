class ListNode{
	int element;
	ListNode next;

	public ListNode(int ele){
	this(ele,null);
	}

	public ListNode (int ele,ListNode n){
	element = ele;
	next=n;
	}
}
class StackLt{
	public ListNode topOfStack;
	public StackLt(){
	//include the relevant code here
	}

	public boolean isEmpty(){
	//include the relevant code here
	}

	public void push(int x){
	//include the relevant code here
	}

	public int top(){
	//include the relevant code here
	}

	public int pop(){
	if(isEmpty()){
	return 0;
	}
	else{
	//include relevant code here
	}
	}
}