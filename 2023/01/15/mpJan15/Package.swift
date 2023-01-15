// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan15",
    products: [
        .library(
            name: "mpJan15",
            targets: ["mpJan15"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan15",
            dependencies: []),
        .testTarget(
            name: "mpJan15Tests",
            dependencies: ["mpJan15"]),
    ]
)
