import sys
import hashlib

br1 = open("formspring_cleartext.txt","r")
br2 = open("formspring_hashtext.txt","w")
br3 = open("formspring.txt","r")
br4 = open("formspringCracked.txt","w")

for line1 in br1:
	line1 = line1.strip()
	for i in xrange(99):
		line_to_be_hashed= str(i).zfill(2) +line1
		# print line_to_be_hashed
		br2.write(hashlib.sha256(line_to_be_hashed).hexdigest())
		br2.write(" ")
		br2.write(line1)
		br2.write("\n")
br2.close()
br2=open("formspring_hashtext.txt","r")
for line2 in br2:
	line2=line2.strip()
	line_split = line2.split(" ")
	c1 = line_split[0]
	for line3 in br3:
		line3=line3.strip()
		# print line3[0]
		if c1 == line3:
			br4.write(line2)
	br3= open("formspring.txt","r")		


