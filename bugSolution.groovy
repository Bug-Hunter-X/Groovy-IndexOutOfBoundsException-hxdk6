def list = [1, 2, 3]

if (list.size() > 3) {
  println list[3] 
} else {
  println "Index out of bounds" 
}

//Alternative using getAt()
println list.getAt(3) ?: "Index out of bounds"