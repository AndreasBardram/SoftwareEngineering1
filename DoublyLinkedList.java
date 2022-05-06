class DoublyLinkedList {
    //A node class for doubly linked list
    class Node{
        Project project;
        Node previous;
        Node next;

        public Node(Project project) {
            this.project = project;
        }
    }

    //Initially, heade and tail is set to null
    Node head, tail = null;

    //add a node to the list
    public void addNode(Project project) {
        //Create a new node
        Node newNode = new Node(project);

        //if list is empty, head and tail points to newNode
        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    public Node removeByProjectName (String name) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while(currentNode != null) {
            if(currentNode.project.getName() == name) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.next;
        }
        if(nodeToRemove == null) {
            return null;
        }
        Node nextNode = nodeToRemove.next;
        Node previousNode = nodeToRemove.previous;
        if(nodeToRemove == this.head) {
            this.head = head.next;
            this.head.previous = null;
        }
        else if(nodeToRemove == this.tail) {
            this.tail = tail.previous;
            this.tail.next = null;
        } else {
            nextNode.previous = previousNode;
            previousNode.next = nextNode;
        }

        return nodeToRemove;
    }

    //print all the nodes of doubly linked list
    public void printProjectList() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Projects in the doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.println(current.project + " ");
            current = current.next;
        }
    }
}



