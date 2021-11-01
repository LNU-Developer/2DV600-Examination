5. a)
      1. Was not able to solve this within the time provided.
      2. As the breadth-first ordering is visiting all successors before unprocessed descendants a possible order could look like this: A -> B -> C -> D -> E -> I -> F -> G -> H
   b)
      1. A possible regex could be: a(aa)*ab(bb)*. This satisfy non-empty string and will first look for an a (uneven), followed by zero or more double a's (uneven), checking for an ab (a becomes even, b uneven) followed by zero or more double b (uneven).
      2. I do a methodical conversion from regex to CFG:
         1. S -> a(aa)*ab(bb)*
         2. S -> a A ab B   A -> (aa)*  B -> (bb)*
         3. S -> a A ab B   A -> (empty) | (bb)+    A -> ε | (aa)+    B -> ε | (bb)+
         4. S -> a A ab B   A -> (empty) | C    C -> aa | aaC   B -> ε | D    D -> bb | bbD
         5. S -> a A ab B   A -> aa | Aaa | ε   B -> bb | Bbb | ε
         6. A simple check could be like this: aab S -> aA(ε)abB(ε) => aab, or aaaab S -> aA(aa)abB(ε) => aaaab. Both looks right.