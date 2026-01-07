const {defineStore} = Pinia
const useBoardListStore=defineStore('board_list',{
	state:()=>({
		list:[],
		curpage:1,
		totalpage:0,
		vo:{}
	}),
	actions:{
		async dataRecv(){
			const res = await axios.get('http://localhost:9090/board/list_vue/',{
				params:{
					page:this.curpage
				}
			})
			this.list=res.data.list
			this.curpage=res.data.curpage
			this.totalpage=res.data.totalpage
		},
		prev(){
			if(this.curpage>1)
				this.curpage=this.curpage-1
			this.dataRecv()
		},
		next(){
			if(this.curpage<this.totalpage)
				this.curpage=this.curpage+1
			this.dataRecv()
		}
	}
})