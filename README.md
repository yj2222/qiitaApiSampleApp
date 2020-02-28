# qiitaApiSampleApp

```
【プロジェクト】
・BtoB系、社内システムのバージョンアップ

【期間】
・6か月

【言語／フレームワーク】
・java/JSP/Servlet/Javascript(JQuery)/MySQL

【その他ツール】
・Access,VBA,VMwere

【業務内容】
・SES。元々あるシステムのヴァージョンアップに伴うコード改修。

【業務の割合】
・コード改修：3
・ドキュメント作成：5
・その他打ち合わせ等：2

【課題、解決】
・旧システムの環境がそろわない。。
	→改修の期間になってもお客様先の明細な環境等がそろわなく、なかなか本来の改修作業に取り掛かれなかった。
	例えば、特定のファイル（Excelなど）に検索結果を出力するコードなどは、コード上で特定のフォルダ階層に対象ファイルの有無を確かめてから出力となる仕組みになっている。
	そのため、フォルダを作成したうえで特定のファイルを配置する必要がある。それをしないとエラーが出た際に切り分けが難しくなる。
	対応としては、逐次営業との連絡を怠らない事と、最初の1～2週間は既存システムをいじり倒し、コードを読み込んだ上で、必要なファイル、吐き出し先など洗い出しをした。
	そのうえでお客様に問い合わせをして、なるべく少ない回数で連絡をとり時間の効率化を図った。
・コードの見づらさの解消。
	→システム自体がかなり長期に渡っていた為、コードのコメントアウト行が多く見づらかった。
	様々な会社を渡り歩いた形跡があり、その会社単位でのルールに従って改修を行っているためコードの統一感のなさが出ていた。
	例えばコメントの書き方でStartやEndを書いてくれてるとこもあればないとこもあったり、編集なのか追加なのか明確に書いてなかったり、テストコードであろうコードがコメントアウトのみで説明がなかったりと・・・。
	特にDBのカラム設定はかなりバラツキがあり、同じカラムであっても、入れる型指定が違ったりとバラツキがめだった。
	対応としては、全体のコードを見たうえで、一番最新のコードに合わせて改修を行った。
	理由は言語のヴァージョンアップなどで非推奨のメソッドなどがある可能性があるので出来るだけ最新のものに合わせようと思ったため。
	またコメントは最小限伝わる方法で記載し出来るだけコードを邪魔しないよう心掛けた。
・改修箇所の明確化。
	→上記「コードの見づらさの解消」にも付随しているところもあるが、プロジェクト自体そこまで大きくなく改修作業は基本一人で担っていた。
	人員構成は、
		・コード改修＆ドキュメント作成：自分
		・レビュワー、営業とのパイプ役：プロジェクトマネージャー
		・お客様とのやり取り：営業
	主に上記3名で構成されてて、コード改修を担ってる自分が何らかの理由で消滅すると、どこまで作業が進んでるか把握できなくなる。
	そのため対応としては、毎日の報告や改修履歴、エラー対応などは逐次Gitlabにアップし作業の明確を図った。
	特にヴァージョンアップに伴う手順やエラー対応などは最悪最初から作業を行ってもすぐ対応できるように、社内資産として画面キャプチャなどを取り見やすくドキュメントをまとめた。
	実質的には作業は増えてしまったが、小さいプロジェクトが故の最悪のケースを考えた対策が打てたと思える。
	
```
	
