# SexyLang

SexyLang is an esoteric programming language inspired by the fountain of life, the creator of us all - sex. The language itself is a strongly static typed programming language, that provides with several basic functionalities such as storing values in variables, arrays, performing mathematical operations, branching based on a boolean expression, looping and defining functions and calling them.

## 1. Supported operators

### 1.1. Arithmetic operators
- Addition ( *+* )
- Subtraction ( *-* )
- Multiplication ( *\** )
- Division ( \/ )

### 1.2. Logic operators
- Negation ( *!* )
- Equals ( *==* )
- Less than ( *<* )
- Greater than ( *>* )


## 2. Variable Types

| Type    | Description  |
|---------|--------------|
| `bulge` | A primitive type used to represent truth values. True value is represented by <code><b>hard</b></code> and a false value is represented by <code><b>soft</b></code>          |
| `bodyCount`| A primitive data type representing an integer |
| `length`| Represents the float data type that stores double-precision floating-point numbers |
| `SafeWord`| Represents a sequence of characters that together form a text |

## 3. Statements

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
            <pre><b>insert</b> SafeWord "shrek" <b>in</b> safeword<br><br><b>insert "shrek2" in safeword </pre>
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
            <b>bedActivity</b> <i>[name]</i> <i>[return type?]</i> (<i>[parameters?]</i>)
        </td>
        <td>
            Function declaration; if no return type is specified, type void is inferred
        </td>
        <td>
            <pre><b>bedActivity</b> stop (SafeWord safeword) {<br>    <b>moanLoud</b> safeword<br>}</pre>
        </td>
    </tr>
    <tr>
        <td>
            <b>ejaculate</b> <i>[data?]
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
            <b>if</b> (<i>[condition]<i>)
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
            <b>elseif</b> (<i>[condition]<i>)
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
            <b>lube</b> (<i>[condition]<i>)
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

#### **HelloSexy.sx** - a very basic program that prints the String *Hello Sexy!* on the console

<pre>
<b>bedActivity</b> intercourse () {
    moanLoud "Hello Sexy!"
}
</pre>

#### **ItsMoreComplicated.sx** - a program that stores a number and increments it based on a condition

<pre>
<b>bedActivity</b> intercourse () {
    <b>insert bodyCount</b> 0 <b>in</b> rounds
    <b>insert bulge soft in</b> isTired
    <b>if</b> (!isTired) {
        <b>insert</b> rounds + 1 <b>in</b> rounds
        <b>moanLoud</b> "Another round, baby!"
    }
}
</pre>

variable and if statement
basic while loop
asking user input

### 4.2. Bad weather examples
