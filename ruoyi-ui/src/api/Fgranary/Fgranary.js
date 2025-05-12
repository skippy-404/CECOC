import request from '@/utils/request'

// 查询Fgranary列表
export function listFgranary(query) {
  return request({
    url: '/Fgranary/Fgranary/list',
    method: 'get',
    params: query
  })
}

// 查询Fgranary详细
export function getFgranary(id) {
  return request({
    url: '/Fgranary/Fgranary/' + id,
    method: 'get'
  })
}

// 新增Fgranary
export function addFgranary(data) {
  return request({
    url: '/Fgranary/Fgranary',
    method: 'post',
    data: data
  })
}

// 修改Fgranary
export function updateFgranary(data) {
  return request({
    url: '/Fgranary/Fgranary',
    method: 'put',
    data: data
  })
}

// 删除Fgranary
export function delFgranary(id) {
  return request({
    url: '/Fgranary/Fgranary/' + id,
    method: 'delete'
  })
}
