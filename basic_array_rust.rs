fn main()
{
//Still need array data query code!

let array: [i32; 3] = [0; 3];

// This iterates by reference:
for item in array.iter().enumerate() {
    let (i, x): (usize, &i32) = item;
    println!("array[{}] = {}", i, x);
    }

// This iterates by value:
for item in array.iter().enumerate() {
    let (i, x): (usize, &i32) = item;
    println!("array[{}] = {}", i, x);
    }
}
