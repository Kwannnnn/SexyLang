# SexyLang

SexyLang is an esoteric programming language inspired by the fountain of life, the creator of us all - sex. The language itself is a strongly static typed programming language, that provides with several basic functionalities such as storing values in variables, arrays, performing mathematical operations, branching based on a boolean expression, looping and defining functions and calling them.

## 1. Supported operators

### 1.1. Arithmetic operators
- Addition ( *+* )
- Subtraction ( *-* )
- Multiplication ( * )
- Division ( \/ )

### 1.2. Relational operators
- Equals ( *==* )
- Not Equals ( *!=* )
- Less Than ( *<* )
- Less Equals ( *<=* )
- Greater Than ( *>* )
- Greater Equals ( *>=* )

### 1.3. Logic operators
- Negation ( *!* )
- And ( *and* )
- Or ( *or* )


## 2. Variable Types

| Type        | Description                                                                                                                                                         |
|-------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `bulge`     | A primitive type used to represent truth values. True value is represented by <code><b>hard</b></code> and a false value is represented by <code><b>soft</b></code> |
| `bodyCount` | A primitive data type representing an integer                                                                                                                       |
| `length`    | Represents the float data type that stores double-precision floating-point numbers                                                                                  |
| `SafeWord`  | Represents a sequence of characters that together form a text                                                                                                       |

## 3. Extra features 
### 3.1. Array Types

| Type         | Description                                                                |
|--------------|----------------------------------------------------------------------------|
| `bulges`     | A reference data type used to store multiple <code>bulge</code> values     |
| `bodyCounts` | A reference data type used to store multiple <code>bodyCount</code> values |
| `lengths`    | A reference data type used to store multiple <code>length</code> values    |
| `SafeWords`  | A reference data type used to store multiple <code>SafeWord</code> values  |

### 3.2. String concatenation
SexyLang supports a feature often found in popular programming languages: ***String concatenation***.
This is simply done by using the '+' operator.

## 4. Statements

SexyLang has the following statements

<table>
    <tr>
        <th>Statement</th>
        <th>Description</th>
        <th>Example usage</th>
    </tr>
    <tr>
        <td>
            3==D <i>[comment]</i>
        </td>
        <td>
            Comment
        </td>
        <td>
            <pre><i>3==D Tease me!</i></pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>insert</b> <i>[type]</i> <i>[value]</i> <b>in</b> <i>[variable]</i>
        </td>
        <td>
            Variable declaration
        </td>
        <td>
            <pre><b>insert</b> SafeWord "shrek" <b>in</b> safeword</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>insert</b> <i>[value]</i> <b>in</b> <i>[variable]</i>
        </td>
        <td>
            Variable assignment
        </td>
        <td>
            <pre><b>insert</b> SafeWord "shrek" <b>in</b> safeword<br><br><b>insert</b> "shrek2" in safeword </pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>moan</b> <i>[data]</i>
        </td>
        <td>
            Print data onto the same line
        </td>
        <td>
            <pre><b>moan</b> "shrek"</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>moanLoud</b> <i>[data]</i>
        </td>
        <td>
            Prints data on a new line
        </td>
        <td>
            <pre><b>moanLoud</b> "shrek"</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>bedActivity</b> <i>[name]</i> <i>[return type]</i> (<i>[parameters?]</i>)
        </td>
        <td>
            Function declaration
        </td>
        <td>
            <pre><b>bedActivity</b> stop empty (SafeWord safeword) {<br>    <b>moanLoud</b> safeword<br>}</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>ejaculate</b> <i>[data?]</i>
        </td>
        <td>
            Indicates the completion of a method or returns a value from a method
        </td>
        <td>
            <pre><b>bedActivity</b> hasFinished <b>bulge</b> () {<br>    <b>ejaculate hard</b> <br>}</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>if</b> (<i>[condition]</i>)
        </td>
        <td>
            Definition of if statement
        </td>
        <td>
            <pre><b>insert bulge hard in</b> d<br><b>if</b> (d == hard) {<br>    <b>moanLoud</b> "Get in"<br>}</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>elseif</b> (<i>[condition]</i>)
        </td>
        <td>
            Definition of elseif statement
        </td>
        <td>
            <pre><b>insert bodyCount 3 in</b> partners<br><b>if</b> (partners == 2) {<br>    <b>moanLoud</b> "..." <br>} elseif (partners == 3) {<br>   <b>moanLoud</b> "It's a trio!"<br>}</pre>
        </td>
    </tr>
        <tr>
        <td>
            <b>else</b>
        </td>
        <td>
            Definition of else statement
        </td>
        <td>
            <pre><b>insert bulge hard in</b> d<br><b>if</b> (d == hard) {<br>    <b>moanLoud</b> "Go for it!" <br>} else {<br>   <b>moanLoud</b> "Try again next time!"<br>}</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>lube</b> (<i>[condition]</i>)
        </td>
        <td>
            Continually executes a block of statements while a particular condition is true
        </td>
        <td>
            <pre><b>insert bulge hard in</b> hole<br><b>lube</b> (hole) {<br>    <b>moanLoud "Yes"</b> <br>}</pre>
        </td>
    </tr>
</table>

<i><b>Note:</b> the parameters marked with a \`<b>?</b>\` are optional.</i>

## 4. Example programs

### 4.1. Good weather examples

#### **HelloSexy.sexy** - a very basic program that prints the String *Hello Sexy!* on the console

<pre>
<b>bedActivity</b> intercourse empty () {
    moanLoud "Hello Sexy!"
    ejaculate
}
</pre>

#### **ItsMoreComplicated.sexy** - a program that stores a number and increments it based on a condition

<pre>
<b>bedActivity</b> moreComplicated empty () {
    <b>insert bodyCount</b> 0 <b>in</b> rounds
    <b>insert bulge soft in</b> isTired
    <b>if</b> (!isTired) {
        <b>insert</b> rounds + 1 <b>in</b> rounds
        <b>moanLoud</b> "Another round, baby!"
    }

    ejaculate
}
</pre>

#### **ItsWayMoreComplicated.sexy** - a program that prints out different Strings based on different conditions

<pre>
<b>bedActivity</b> wayMoreComplicated empty () {
    <b>insert bodyCount</b> 16 <b>in</b> p1Age
    <b>insert bodyCount</b> 21 <b>in</b> p2Age
    <b>insert bulge hard in</b> isConsensual
    <b>insert SafeWord "" in</b> message

    <b>if</b> (isConsensual) {
        <b>if</b> (p1Age < 16 <b>or</b> p2Age < 16) {
            insert "Hey, that's illegal!" in message
        } <b>else</b> {
            insert "Here we go!" in message
        }
    } <b> else </b> {
        insert "I respect your boring decision" in message
    }

    moanLoud message

    ejaculate
}
</pre>

#### **Safewords.sexy** - a program that declares a function that accepts String parameters and returns an array. A concatenated String is then formed from the array and printed out.

<pre>
<b>bedActivity</b> getSafewords SafeWords() {
    ejaculate ["Juice it", "or Lose it"]
}

<b>insert</b> SafeWords getSafewords() <b>in</b> safeWordArray

<b>insert</b> SafeWord "" <b>in</b> safePhrase

<b>insert</b> bodyCount 0 <b>in</b> i 
lube (i < 2) {
    <b>insert</b> safePhrase + " " + safeWordArray[i] <b>in</b> safePhrase
    <b>insert</b> i + 1 <b>in</b> i
}

moanLoud safePhrase
</pre>

#### **Toy.sexy** - a program that takes user input and continually runs in a loop until a certain condition is false
<pre>
<b>bedActivity</b> playToy empty (length toyLength) {
    <b>insert length</b> 20.0 <b>in</b> toyBattery
    <b>lube</b> (toyBattery > 0.0) {
        <b>if</b> (toyLength > 20.0) {
            moanLoud "It is hitting my deepest spot!"
        }

        <b>moanLoud</b> "It's better than the real thing!"
        <b>insert</b> toyBattery - 10.0 <b>in</b> toyBattery
    }
    <b>moanLoud</b> "The fun is over. No more battery!"

    ejaculate
}
    
playToy(whatLength())
</pre>
### 4.2. Bad weather examples
#### **WrongLength.sexy** - a basic program that assigns a wrong value to a variable type and then tries to print it.

<pre>
<b>bedActivity</b> wrongLength empty () {
    <b>insert length</b> "long" <b>in</b> dLength
    moanLoud dLength

    ejaculate
}
</pre>

#### **FailedEjaculation.sexy** - a basic function that returns an invalid type

<pre>
<b>bedActivity</b> failedEjaculation empty () {
    ejaculate "I am arriving baby!"
}
</pre>

#### **Empty.sexy** - a program that has an if statement with an empty condition

<pre>
<b>bedActivity</b> emptiness empty () {
    <b>insert bulge soft in</b> isTired
    <b>if</b> () {
        <b>moanLoud</b> "Another round, baby!"
    }
}
</pre>

#### **WrongToy.sexy** - a program that performs an infinite loop.

<pre>
<b>bedActivity</b> wrongToy empty () {
    <b>insert length</b> 69.6 <b>in</b> toyBattery
    <b>lube</b> (toyBattery >= 0) {
        <b>moanLoud</b> "It's better than the real thing!"
    }

    <b>moanLoud</b> "The fun is over. No more battery!"

    ejaculate
}
</pre>

#### **WrongSafeword.sexy** - a program that declares a function that accepts a parameter and returns a result. However, this time the parameter is of the wrong type.

<pre>
<b>bedActivity</b> checkSafeword bulge (SafeWord safeword) {
    <b>ejaculate hard</b>
}

<b>insert bulge</b> soft <b>in</b> safeWord
<b>insert bulge</b> checkSafeword(safeWord) <b>in</b> safewordIsCorrect
</pre>


