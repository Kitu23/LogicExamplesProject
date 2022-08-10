
public class AddTwoNumbersInArrayList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(3);
		ListNode node11 = new ListNode(4, node1);
		ListNode node12 = new ListNode(2, node11);
		
		ListNode node2 = new ListNode(4);
		ListNode node21 = new ListNode(6, node2);
		ListNode node22 = new ListNode(5, node21);
		ListNode outLink = addTwoNumbers(node22, node12);
		ListNode.printList(outLink);
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
	
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	static void printList(ListNode list) {
		System.out.println("[ ");
		while(list != null) {
			System.out.println(list.val + ",");
			list = list.next;
		}
		System.out.println("]");
	}
}
