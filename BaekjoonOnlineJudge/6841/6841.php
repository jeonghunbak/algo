<?php
$dict = [
    "CU" => "see you",
    ":-)" => "I’m happy",
    ":-(" => "I’m unhappy",
    ";-)" => "wink",
    ":-P" => "stick out my tongue",
    "(~.~)" => "sleepy",
    "TA" => "totally awesome",
    "CCC" => "Canadian Computing Competition",
    "CUZ" => "because",
    "TY" => "thank-you",
    "YW" => "you’re welcome",
    "TTYL" => "talk to you later"
];

while (($line = fgets(STDIN)) !== false) {
    $word = trim($line);
    echo ($dict[$word] ?? $word) . PHP_EOL;

    if ($word === "TTYL") break;
}
