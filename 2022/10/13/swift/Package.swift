// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "swift",
    products: [
        .library(
            name: "swift",
            targets: ["swift"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "swift",
            dependencies: []),
    ]
)
