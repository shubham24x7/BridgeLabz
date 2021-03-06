
public class LinkedList {
	
	Node head;
	
	LinkedList(){
		head=null;
	}
	
	public void insert(Node n) {
		Node t = head;
		if(t==null) {
		n.next=n;
		head=n;
		
	}	
		
		else if(t.data>=n.data) {
			while(t.next!=head) 
				t=t.next;
			t.next=n;
			n.next=head;
			head=n;
					}
		
		else  {
			while(t.next!=head && t.next.data<n.data) 
				t=t.next;
			n.next=t.next;
			t.next=n;
			
		}
		
	}
	
	public void display() {
		//if(head!=null) {
		Node t=head;
		do{
			
			System.out.println(t.data);
			t=t.next;
		}while(t!=head);
		/*while(t!=head) {
			
			System.out.println(t.data);
			t=t.next;
		}*/
		
	}
	
	public void search(int item) {
		int c=0;
		Node t=head;
		do{
			if(t.data==item)
				c++;
			t=t.next;
		}while(t!=head);
		if(c>0) 
			System.out.println(item+" is present");
		else
			System.out.println(item+" is not present");
		
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		int a[]=new int[] {1,2,7,11,10,0};
		Node temp=null;
		for(int i=0;i<a.length;i++) {
			temp = new Node(a[i]);
			l.insert(temp);
		}
		l.display();
		
		l.search(10);
		l.search(5);
		
	}
}
