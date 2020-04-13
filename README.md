
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/flashTest3.css">
</head>
<body>

    <div class="back">
        <h1>Test Text</h1>
    </div>
    
</body>
</html>


/*
    ・アニメーション参考資料↓
    https://techacademy.jp/magazine/25592
    ・ボタンフラッシュ参考資料↓
    https://qiita.com/mi_upto/items/9fcef2d186f669adee61
    ・文字グラデーション↓
    https://marie-web.design/blog/text-gradation/
 */

.back{
    background-color: gray;
    width: 100%;
    height: 100vh;
}

h1{
    font-size: 50px;
    color: blue;
    background: -webkit-linear-gradient(-30deg, black 1%, white 5%, black 10%);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    /* バックグラウンドの配置変更。％指定したかったが上手く聞かなかったのでpx指定にしてる。参考資料↓ */
    /* https://developer.mozilla.org/ja/docs/Web/CSS/background-position */
    background-position: -100px;
    animation-name: flashBtn;
    animation-duration: 0.3s;
    animation-timing-function: ease;
    animation-delay: 0s;
    animation-iteration-count: 2;
    animation-direction: normal;
}

@keyframes flashBtn{
    0%{
        background-position: -100px;
    }
    100%{
        background-position: 200px;
    }
}
