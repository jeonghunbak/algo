const fs = require('fs');

const input = fs.readFileSync(0, 'utf8').trim().split('\n');

const dict = {
  'CU': 'see you',
  ':-)': "I’m happy",
  ':-(': "I’m unhappy",
  ';-)': 'wink',
  ':-P': 'stick out my tongue',
  '(~.~)': 'sleepy',
  'TA': 'totally awesome',
  'CCC': 'Canadian Computing Competition',
  'CUZ': 'because',
  'TY': 'thank-you',
  'YW': "you’re welcome",
  'TTYL': 'talk to you later',
};

const result = [];

for (const line of input) {
  const word = line.trim();

  result.push(dict[word] ?? word);

  if (word === 'TTYL') break;
}

console.log(result.join('\n'));
