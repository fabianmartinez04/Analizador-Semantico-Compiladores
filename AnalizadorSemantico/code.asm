SECTION .data ; data section 
	 x: dd 	0 
SECTION .text ; code section 
 	 global _start ; entry point 
_start: 
	mov 	rcx,[x]
	mov 	r15,4
	cmp 	rcx,r15
	mov 	 rax,x
	mov 	 rcx,8
	sub 	rax,rcx
	mov 	[x],rax
	mov 	rax,0
	mov 	[x],rax 
	mov 	rax,[x]
	inc 	rax 
	mov 	[x],rax
	mov 	rax,[x]
	dec 	rax 
	mov 	[x],rax
	mov 	rcx,[x]
	mov 	r15,10
	cmp 	rcx,r15
	mov 	rax,[x]
	inc 	rax 
	mov 	[x],rax
final: 
	 mov 	 ebx,0 
	 mov 	 eax,1 
	 int 	 0x80